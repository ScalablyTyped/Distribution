package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialBreadcrumbsProps
import typings.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbsMod.BreadcrumbsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Breadcrumbs")
@js.native
open class Breadcrumbs protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Breadcrumbs {
  def this(props: BreadcrumbsProps) = this()
  def this(props: BreadcrumbsProps, context: Any) = this()
}
/* static members */
object Breadcrumbs {
  
  @JSImport("@blueprintjs/core", "Breadcrumbs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Breadcrumbs.defaultProps")
  @js.native
  def defaultProps: PartialBreadcrumbsProps = js.native
  inline def defaultProps_=(x: PartialBreadcrumbsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
