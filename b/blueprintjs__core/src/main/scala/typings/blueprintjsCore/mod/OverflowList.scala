package typings.blueprintjsCore.mod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.anon.PartialIOverflowListPropsClassName
import typings.blueprintjsCore.overflowListMod.IOverflowListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "OverflowList")
@js.native
class OverflowList[T] ()
  extends typings.blueprintjsCore.componentsMod.OverflowList[T]
/* static members */
@JSImport("@blueprintjs/core", "OverflowList")
@js.native
object OverflowList extends js.Object {
  
  var defaultProps: PartialIOverflowListPropsClassName = js.native
  
  var displayName: String = js.native
  
  def ofType[U](): Instantiable1[
    /* props */ IOverflowListProps[U], 
    typings.blueprintjsCore.overflowListMod.OverflowList[U]
  ] = js.native
}
