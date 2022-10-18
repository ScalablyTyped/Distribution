package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Backward
import typings.ckeditorCkeditor5Engine.anon.Direction
import typings.ckeditorCkeditor5Engine.anon.IgnoreMarkers
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typings.ckeditorCkeditor5Engine.srcModelPositionMod.PositionStickiness
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typings.ckeditorCkeditor5Engine.srcModelSelectionMod.Selectable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelModelMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/model", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Model
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ @js.native
  trait Model extends StObject {
    
    def applyOperation(operation: Operation): Unit = js.native
    
    def change[T](callback: js.Function1[/* writer */ typings.ckeditorCkeditor5Engine.srcModelWriterMod.default, T]): T = js.native
    
    def createBatch(): typings.ckeditorCkeditor5Engine.srcModelBatchMod.default = js.native
    @JSName("createBatch")
    def createBatch_0(
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (type : @ckeditor/ckeditor5-engine.anon.IsLocal | undefined): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/batch.default>[0] */ js.Any
    ): typings.ckeditorCkeditor5Engine.srcModelBatchMod.default = js.native
    
    def createOperationFromJSON(arg: Record[String, Any]): Operation = js.native
    
    def createPositionAfter(item: Item): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionFromPath(root: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default, path: js.Array[Double]): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(
      root: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default, path: js.Array[Double]): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(
      root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createRange(start: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def createRange(
      start: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createRangeIn(element: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createRangeOn(item: Item): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createSelection(): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable]): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: before | end | after | on | in, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Double, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Unit, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Unit, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    
    def deleteContent(selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Unit = js.native
    def deleteContent(
      selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default,
      options: Direction
    ): Unit = js.native
    def deleteContent(selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default): Unit = js.native
    def deleteContent(selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default, options: Direction): Unit = js.native
    
    def destroy(): Unit = js.native
    
    val document: typings.ckeditorCkeditor5Engine.srcModelDocumentMod.default = js.native
    
    def enqueueChange(
      batchOrType: typings.ckeditorCkeditor5Engine.srcModelBatchMod.default,
      callback: js.Function1[/* writer */ typings.ckeditorCkeditor5Engine.srcModelWriterMod.default, Unit]
    ): Unit = js.native
    def enqueueChange(
      callback: js.Function1[/* writer */ typings.ckeditorCkeditor5Engine.srcModelWriterMod.default, Unit]
    ): Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_0(
      batchOrType: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (type : @ckeditor/ckeditor5-engine.anon.IsLocal | undefined): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/batch.default>[0] */ js.Any,
      callback: js.Function1[/* writer */ typings.ckeditorCkeditor5Engine.srcModelWriterMod.default, Unit]
    ): Unit = js.native
    
    def getSelectedContent(selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    def getSelectedContent(selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    def hasContent(rangeOrElement: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): Boolean = js.native
    def hasContent(rangeOrElement: typings.ckeditorCkeditor5Engine.srcModelElementMod.default, options: IgnoreMarkers): Boolean = js.native
    def hasContent(rangeOrElement: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): Boolean = js.native
    def hasContent(rangeOrElement: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default, options: IgnoreMarkers): Boolean = js.native
    
    def insertContent(content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Unit,
      placeOrOffset: before | end | after | on | in
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Unit,
      placeOrOffset: Double
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable,
      placeOrOffset: before | end | after | on | in
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable,
      placeOrOffset: Double
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Unit, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Unit, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable, placeOrOffset: before | end | after | on | in): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable, placeOrOffset: Double): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    val markers: typings.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default = js.native
    
    def modifySelection(selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Unit = js.native
    def modifySelection(
      selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default,
      options: typings.ckeditorCkeditor5Engine.anon.Unit
    ): Unit = js.native
    def modifySelection(selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default): Unit = js.native
    def modifySelection(
      selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default,
      options: typings.ckeditorCkeditor5Engine.anon.Unit
    ): Unit = js.native
    
    val schema: Schema = js.native
  }
}
