package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.itemMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelconsumableMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/modelconsumable", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModelConsumable
  
  @js.native
  trait ModelConsumable extends StObject {
    
    def add(item: typings.ckeditorCkeditor5Engine.documentselectionMod.default, `type`: String): Unit = js.native
    def add(item: Item, `type`: String): Unit = js.native
    def add(item: typings.ckeditorCkeditor5Engine.rangeMod.default, `type`: String): Unit = js.native
    def add(item: typings.ckeditorCkeditor5Engine.selectionMod.default, `type`: String): Unit = js.native
    
    def consume(item: typings.ckeditorCkeditor5Engine.documentselectionMod.default, `type`: String): Boolean = js.native
    def consume(item: Item, `type`: String): Boolean = js.native
    def consume(item: typings.ckeditorCkeditor5Engine.rangeMod.default, `type`: String): Boolean = js.native
    def consume(item: typings.ckeditorCkeditor5Engine.selectionMod.default, `type`: String): Boolean = js.native
    
    def revert(item: typings.ckeditorCkeditor5Engine.documentselectionMod.default, `type`: String): Null | Boolean = js.native
    def revert(item: Item, `type`: String): Null | Boolean = js.native
    def revert(item: typings.ckeditorCkeditor5Engine.rangeMod.default, `type`: String): Null | Boolean = js.native
    def revert(item: typings.ckeditorCkeditor5Engine.selectionMod.default, `type`: String): Null | Boolean = js.native
    
    def test(item: typings.ckeditorCkeditor5Engine.documentselectionMod.default, `type`: String): Null | Boolean = js.native
    def test(item: Item, `type`: String): Null | Boolean = js.native
    def test(item: typings.ckeditorCkeditor5Engine.rangeMod.default, `type`: String): Null | Boolean = js.native
    def test(item: typings.ckeditorCkeditor5Engine.selectionMod.default, `type`: String): Null | Boolean = js.native
  }
}
