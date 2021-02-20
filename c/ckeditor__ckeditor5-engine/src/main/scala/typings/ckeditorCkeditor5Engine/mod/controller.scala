package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.`0`
import typings.ckeditorCkeditor5Engine.mod.conversion.DowncastDispatcher
import typings.ckeditorCkeditor5Engine.mod.conversion.Mapper
import typings.ckeditorCkeditor5Engine.mod.conversion.UpcastDispatcher
import typings.ckeditorCkeditor5Engine.mod.dataprocessor.DataProcessor
import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.model.Model
import typings.ckeditorCkeditor5Engine.mod.model.SchemaContextDefinition
import typings.ckeditorCkeditor5Engine.mod.view.View
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controller {
  
  // engine/controller/datacontroller
  @JSImport("@ckeditor/ckeditor5-engine", "controller.DataController")
  @js.native
  class DataController protected () extends Observable {
    def this(model: Model) = this()
    def this(model: Model, dataProcessor: DataProcessor) = this()
    
    def destroy(): Unit = js.native
    
    val downcastDispatcher: DowncastDispatcher = js.native
    
    def get(): String = js.native
    def get(rootName: String): String = js.native
    
    def init(data: String): js.Promise[_] = js.native
    def init(data: String, rootName: String): js.Promise[_] = js.native
    
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
    
    val mapper: Mapper = js.native
    
    val model: Model = js.native
    
    def on(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def once(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def parse(data: String): DocumentFragment = js.native
    def parse(data: String, context: SchemaContextDefinition): DocumentFragment = js.native
    
    val processor: DataProcessor = js.native
    
    def stringify(modelElementOrFragment: DocumentFragment): String = js.native
    def stringify(modelElementOrFragment: Element): String = js.native
    
    def toModel(viewElementOrFragment: DocumentFragment): DocumentFragment = js.native
    def toModel(viewElementOrFragment: DocumentFragment, context: SchemaContextDefinition): DocumentFragment = js.native
    def toModel(viewElementOrFragment: Element): DocumentFragment = js.native
    def toModel(viewElementOrFragment: Element, context: SchemaContextDefinition): DocumentFragment = js.native
    
    def toView(modelElementOrFragment: DocumentFragment): DocumentFragment = js.native
    def toView(modelElementOrFragment: Element): DocumentFragment = js.native
    
    val upcastDispatcher: UpcastDispatcher = js.native
  }
  
  // engine/controller/editingcontroller
  @JSImport("@ckeditor/ckeditor5-engine", "controller.EditingController")
  @js.native
  class EditingController protected () extends Observable {
    def this(model: Model) = this()
    
    def destroy(): Unit = js.native
    
    val downcastDispatcher: DowncastDispatcher = js.native
    
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
    
    val mapper: Mapper = js.native
    
    val model: Model = js.native
    
    def on(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    def once(event: String, callback: js.Function, options: `0`): Unit = js.native
    
    val view: View = js.native
  }
}
