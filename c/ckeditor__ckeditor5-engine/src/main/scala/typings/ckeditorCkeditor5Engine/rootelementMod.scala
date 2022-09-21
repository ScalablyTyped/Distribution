package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ckeditorCkeditor5Engine.schemaMod._SchemaContextDefinition because Already inherited
  - typings.ckeditorCkeditor5Engine.selectionMod._Selectable because Already inherited
  - typings.ckeditorCkeditor5Engine.itemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/model/rootelement", JSImport.Default)
  @js.native
  open class default protected () extends RootElement {
    def this(document: typings.ckeditorCkeditor5Engine.documentMod.default, name: String) = this()
    def this(document: typings.ckeditorCkeditor5Engine.documentMod.default, name: String, rootName: String) = this()
  }
  
  @js.native
  trait RootElement
    extends typings.ckeditorCkeditor5Engine.elementMod.default {
    
    val document: typings.ckeditorCkeditor5Engine.documentMod.default | Null = js.native
    
    val rootName: String = js.native
  }
}
