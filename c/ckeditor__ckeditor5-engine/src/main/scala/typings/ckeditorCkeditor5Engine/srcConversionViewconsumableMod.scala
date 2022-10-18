package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AttributesClasses
import typings.ckeditorCkeditor5Engine.anon.Classes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionViewconsumableMod {
  
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
    
    inline def consumablesFromElement(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("consumablesFromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Classes]
    
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default, instance: ViewConsumable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createFrom(from: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default, instance: ViewConsumable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFrom")(from.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait ViewConsumable extends StObject {
    
    def add(element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default, consumables: AttributesClasses): Unit = js.native
    def add(element: typings.ckeditorCkeditor5Engine.srcViewTextMod.default): Unit = js.native
    
    def consume(element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default, consumables: AttributesClasses): Boolean = js.native
    def consume(element: typings.ckeditorCkeditor5Engine.srcViewTextMod.default): Boolean = js.native
    
    def revert(element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.srcViewElementMod.default, consumables: AttributesClasses): Unit = js.native
    def revert(element: typings.ckeditorCkeditor5Engine.srcViewTextMod.default): Unit = js.native
    
    def test(element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): Boolean | Null = js.native
    def test(
      element: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      consumables: AttributesClasses
    ): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.srcViewNodeMod.default, consumables: AttributesClasses): Boolean | Null = js.native
    def test(element: typings.ckeditorCkeditor5Engine.srcViewTextMod.default): Boolean | Null = js.native
  }
}
