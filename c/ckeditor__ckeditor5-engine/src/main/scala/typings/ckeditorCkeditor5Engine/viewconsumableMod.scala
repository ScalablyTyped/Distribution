package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AttributesClasses
import typings.ckeditorCkeditor5Engine.anon.Classes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewconsumableMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/viewconsumable", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ViewConsumable
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/conversion/viewconsumable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def consumablesFromElement(element: typings.ckeditorCkeditor5Engine.viewElementMod.default): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("consumablesFromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Classes]
    
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default, instance: ViewConsumable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.viewNodeMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.viewNodeMod.default, instance: ViewConsumable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait ViewConsumable extends StObject {
    
    def add(element: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.viewElementMod.default): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.viewElementMod.default, consumables: AttributesClasses): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.viewTextMod.default): Unit = js.native
    
    def consume(element: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.viewElementMod.default): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.viewElementMod.default, consumables: AttributesClasses): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.viewTextMod.default): Boolean = js.native
    
    def revert(element: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.viewElementMod.default): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.viewElementMod.default, consumables: AttributesClasses): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.viewTextMod.default): Unit = js.native
    
    def test(element: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default): Boolean | Null = js.native
    def test(
      element: typings.ckeditorCkeditor5Engine.viewDocumentfragmentMod.default,
      consumables: AttributesClasses
    ): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.viewNodeMod.default): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.viewNodeMod.default, consumables: AttributesClasses): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.viewTextMod.default): Boolean | Null = js.native
  }
}
