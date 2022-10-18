package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.DataString
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelTextMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.srcModelSchemaMod._SchemaContextDefinition because Already inherited
  - typings.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.srcModelItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/model/text", JSImport.Default)
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
    
    inline def fromJSON(json: DataString): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Text]
  }
  
  @js.native
  trait Text
    extends typings.ckeditorCkeditor5Engine.srcModelNodeMod.default {
    
    val data: String = js.native
  }
}
