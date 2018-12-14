package typings
package atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "controller")
@js.native
object controllerNs extends js.Object {
  // engine/controller/datacontroller
  @js.native
  class DataController protected ()
    extends atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.Observable {
    def this(model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model) = this()
    def this(model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model, dataProcessor: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.dataprocessorNs.DataProcessor) = this()
    val downcastDispatcher: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.conversionNs.DowncastDispatcher = js.native
    val mapper: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.conversionNs.Mapper = js.native
    val model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model = js.native
    val processor: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.dataprocessorNs.DataProcessor = js.native
    val upcastDispatcher: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.conversionNs.UpcastDispatcher = js.native
    def destroy(): scala.Unit = js.native
    def get(): java.lang.String = js.native
    def get(rootName: java.lang.String): java.lang.String = js.native
    def init(data: java.lang.String): js.Promise[_] = js.native
    def init(data: java.lang.String, rootName: java.lang.String): js.Promise[_] = js.native
    def parse(data: java.lang.String): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def parse(
      data: java.lang.String,
      context: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.SchemaContextDefinition
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def stringify(
      modelElementOrFragment: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment
    ): java.lang.String = js.native
    def stringify(modelElementOrFragment: stdLib.Element): java.lang.String = js.native
    def toModel(
      viewElementOrFragment: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def toModel(
      viewElementOrFragment: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      context: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.SchemaContextDefinition
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def toModel(viewElementOrFragment: stdLib.Element): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def toModel(
      viewElementOrFragment: stdLib.Element,
      context: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.SchemaContextDefinition
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def toView(
      modelElementOrFragment: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def toView(modelElementOrFragment: stdLib.Element): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
  }
  
  // engine/controller/editingcontroller
  @js.native
  class EditingController protected ()
    extends atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.Observable {
    def this(model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model) = this()
    val downcastDispatcher: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.conversionNs.DowncastDispatcher = js.native
    val mapper: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.conversionNs.Mapper = js.native
    val model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model = js.native
    val view: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.View = js.native
    def destroy(): scala.Unit = js.native
  }
  
}

