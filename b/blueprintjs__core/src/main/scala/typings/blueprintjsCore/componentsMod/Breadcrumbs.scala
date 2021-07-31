package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialIBreadcrumbsProps
import typings.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs")
@js.native
class Breadcrumbs protected ()
  extends typings.blueprintjsCore.breadcrumbsMod.Breadcrumbs {
  def this(props: IBreadcrumbsProps) = this()
  def this(props: IBreadcrumbsProps, context: js.Any) = this()
}
/* static members */
object Breadcrumbs {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs.defaultProps")
  @js.native
  def defaultProps: PartialIBreadcrumbsProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialIBreadcrumbsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
