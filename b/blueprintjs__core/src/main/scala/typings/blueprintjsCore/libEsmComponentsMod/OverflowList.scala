package typings.blueprintjsCore.libEsmComponentsMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.anon.PartialOverflowListPropsa
import typings.blueprintjsCore.libEsmComponentsOverflowListOverflowListMod.OverflowListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "OverflowList")
@js.native
open class OverflowList[T] protected ()
  extends typings.blueprintjsCore.libEsmComponentsOverflowListOverflowListMod.OverflowList[T] {
  def this(props: OverflowListProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: OverflowListProps[T], context: Any) = this()
}
/* static members */
object OverflowList {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "OverflowList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "OverflowList.defaultProps")
  @js.native
  def defaultProps: PartialOverflowListPropsa = js.native
  inline def defaultProps_=(x: PartialOverflowListPropsa): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "OverflowList.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def ofType[U](): Instantiable1[
    /* props */ OverflowListProps[U], 
    typings.blueprintjsCore.libEsmComponentsOverflowListOverflowListMod.OverflowList[U]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
    /* props */ OverflowListProps[U], 
    typings.blueprintjsCore.libEsmComponentsOverflowListOverflowListMod.OverflowList[U]
  ]]
}
