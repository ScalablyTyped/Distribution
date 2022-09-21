package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.AttributesData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.schemaMod._SchemaContextDefinition because Already inherited
  - typings.ckeditorCkeditor5Engine.selectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.itemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/model/text", JSImport.Default)
  @js.native
  open class default protected () extends Text {
    def this(data: String) = this()
    def this(data: String, attrs: js.Tuple2[String, String]) = this()
    def this(data: String, attrs: Record[String, String]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: AttributesData): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Text]
  }
  
  @js.native
  trait Text
    extends typings.ckeditorCkeditor5Engine.nodeMod.default {
    
    val data: String = js.native
  }
}
