package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialBreadcrumbsProps
import typings.blueprintjsCore.breadcrumbsMod.BreadcrumbsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs")
@js.native
open class Breadcrumbs protected ()
  extends typings.blueprintjsCore.breadcrumbsMod.Breadcrumbs {
  def this(props: BreadcrumbsProps) = this()
  def this(props: BreadcrumbsProps, context: Any) = this()
}
/* static members */
object Breadcrumbs {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs.defaultProps")
  @js.native
  def defaultProps: PartialBreadcrumbsProps = js.native
  inline def defaultProps_=(x: PartialBreadcrumbsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
