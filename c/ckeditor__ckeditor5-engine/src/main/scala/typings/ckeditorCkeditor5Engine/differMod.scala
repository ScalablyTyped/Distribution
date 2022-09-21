package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.IncludeChangesInGraveyard
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attribute
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insert
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove
import typings.ckeditorCkeditor5Engine.itemMod.Item
import typings.ckeditorCkeditor5Engine.markercollectionMod.Marker
import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object differMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Differ {
    def this(markerCollection: typings.ckeditorCkeditor5Engine.markercollectionMod.default) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemAttribute")
  @js.native
  open class DiffItemAttribute ()
    extends StObject
       with DiffItem {
    
    var attributeKey: String = js.native
    
    var attributeNewValue: String = js.native
    
    var attributeOldValue: String = js.native
    
    var range: typings.ckeditorCkeditor5Engine.rangeMod.default = js.native
    
    var `type`: attribute = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemInsert")
  @js.native
  open class DiffItemInsert ()
    extends StObject
       with DiffItem {
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var position: typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    var `type`: insert = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemRemove")
  @js.native
  open class DiffItemRemove ()
    extends StObject
       with DiffItem {
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var position: typings.ckeditorCkeditor5Engine.positionMod.default = js.native
    
    var `type`: remove = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.differMod.DiffItemInsert
    - typings.ckeditorCkeditor5Engine.differMod.DiffItemRemove
    - typings.ckeditorCkeditor5Engine.differMod.DiffItemAttribute
  */
  trait DiffItem extends StObject
  
  @js.native
  trait Differ extends StObject {
    
    def bufferMarkerChange(markerName: String, oldRange: Null, newRange: Null, affectsData: Boolean): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: Null,
      newRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      affectsData: Boolean
    ): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      newRange: Null,
      affectsData: Boolean
    ): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      newRange: typings.ckeditorCkeditor5Engine.rangeMod.default,
      affectsData: Boolean
    ): Unit = js.native
    
    def bufferOperation(operation: Operation): Unit = js.native
    
    def getChangedMarkers(): js.Array[Marker] = js.native
    
    def getChanges(): js.Array[DiffItem] = js.native
    def getChanges(options: IncludeChangesInGraveyard): js.Array[DiffItem] = js.native
    
    def getMarkersToAdd(): js.Array[Marker] = js.native
    
    def getMarkersToRemove(): js.Array[Marker] = js.native
    
    def hasDataChanges(): Boolean = js.native
    
    val isEmpty: Boolean = js.native
    
    def refreshItem(item: Item): Unit = js.native
    
    def reset(): Unit = js.native
  }
}
