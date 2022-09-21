package typings.ceddlCeddlPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.ceddlCeddlPolyfill.anon.FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ceddl/ceddl-polyfill", "Model")
  @js.native
  open class Model () extends StObject
  
  object ceddl {
    
    @JSImport("@ceddl/ceddl-polyfill", "ceddl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A call to emitEvent will add the event to the event store and process the event
      * onto the eventbus. If you have a large number of different events on a page, the
      * convention is to use colons to namespace them: "poll:start", or "change:selection".
      * @example
      *    ceddl.emitEvent('poll:start', {
      *       url: window.location.href,
      *       trigger: 'shipping view more than 5s'
      *    });
      */
    inline def emitEvent(name: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitEvent")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A call to emitModel will perform the following sequance:
      *   - Validate the data input against the a root model definitions.
      *   - Store the data in the model store.
      *   - Send main event on the eventbus.
      *   - Recursively moves through the delta to publish the smallest changes under a specific eventName. The dot "page.title" will be used as a namespace separator.
      * @example
      *    ceddl.emitModel('funnel', {
      *      category: 'single_sign_on',
      *      name: 'register',
      *      stepName: password set,
      *      step: 2
      *    });
      *
      * In many cases where this function used the html interface will give you a more maintanable / testable solution.
      */
    inline def emitModel(name: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitModel")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Message bus to enable you to de-couple your application's
      * components.
      */
    @JSImport("@ceddl/ceddl-polyfill", "ceddl.eventbus")
    @js.native
    def eventbus: Eventbus = js.native
    inline def eventbus_=(x: Eventbus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventbus")(x.asInstanceOf[js.Any])
    
    /**
      * Returns all stored events.
      */
    inline def getEvents(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEvents")().asInstanceOf[js.Array[Any]]
    
    /**
      * Returns all currently stored data model value's.
      */
    inline def getModels(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[Any]
    
    /**
      * The initialize function makes it possible to do async loading of the model
      * definitions and initialize the html interface when ready. The initialize
      * also clears the events and models stored allowing ceddl to be used in single
      * page applications.
      */
    inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
    
    /**
      * Creating, configuring data models for datalayer
      */
    @JSImport("@ceddl/ceddl-polyfill", "ceddl.modelFactory")
    @js.native
    def modelFactory: ModelFactory = js.native
    inline def modelFactory_=(x: ModelFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelFactory")(x.asInstanceOf[js.Any])
  }
  
  trait ArrayField extends StObject {
    
    def validate(): Unit
  }
  object ArrayField {
    
    inline def apply(validate: () => Unit): ArrayField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[ArrayField]
    }
    
    extension [Self <: ArrayField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  trait BooleanField extends StObject {
    
    def validate(): Unit
  }
  object BooleanField {
    
    inline def apply(validate: () => Unit): BooleanField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[BooleanField]
    }
    
    extension [Self <: BooleanField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Eventbus extends StObject {
    
    /**
      * Emits an event of the given type with the given data. All handlers of that
      * particular type will be notified. Arbitrary arguments can be passed
      * in many forms and will be forwarded to the listeners
      * @example
      *   eventbus.on('someEvent', function(message) {
      *     console.log(message);
      *   });
      *
      *   eventbus.emit('someEvent', 'abc'); // logs 'abc'
      */
    def emit(name: String, args: Any*): Unit = js.native
    
    /**
      * Remove a specific callback from an event, or remove all callbacks from an
      * event by not passing a function and scope. When removing bound functions
      * you must also pass the correct scope.
      */
    def off(name: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def off(name: String, callback: js.Function1[/* repeated */ Any, Unit], scope: Any): Unit = js.native
    
    /**
      * Adds a listener to be invoked when events of the specified type are
      * emitted. An optional calling context may be provided. The data arguments
      * emitted will be passed to the listener function.
      */
    def on(name: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def on(name: String, callback: js.Function1[/* repeated */ Any, Unit], scope: Any): Unit = js.native
    
    /**
      * Similar to on, except that the listener is removed after it is
      * invoked once.
      */
    def once(name: String, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def once(name: String, callback: js.Function1[/* repeated */ Any, Unit], scope: Any): Unit = js.native
  }
  
  trait ListField extends StObject {
    
    def validate(): Unit
  }
  object ListField {
    
    inline def apply(validate: () => Unit): ListField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[ListField]
    }
    
    extension [Self <: ListField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  trait ModelConfig extends StObject {
    
    var `extends`: js.UndefOr[String] = js.undefined
    
    var fields: StringDictionary[FieldType]
    
    var key: String
    
    var root: Boolean
  }
  object ModelConfig {
    
    inline def apply(fields: StringDictionary[FieldType], key: String, root: Boolean): ModelConfig = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelConfig]
    }
    
    extension [Self <: ModelConfig](x: Self) {
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFields(value: StringDictionary[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelFactory extends StObject {
    
    /**
      * Create a new model so that the html inteface can be created and for validating incomming data against.
      * details at https://www.ceddlbyexample.com/data-models
      */
    def create(modelConfig: ModelConfig): Model
    
    var fields: typings.ceddlCeddlPolyfill.anon.ArrayField
  }
  object ModelFactory {
    
    inline def apply(create: ModelConfig => Model, fields: typings.ceddlCeddlPolyfill.anon.ArrayField): ModelFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelFactory]
    }
    
    extension [Self <: ModelFactory](x: Self) {
      
      inline def setCreate(value: ModelConfig => Model): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setFields(value: typings.ceddlCeddlPolyfill.anon.ArrayField): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelField extends StObject {
    
    def validate(): Unit
  }
  object ModelField {
    
    inline def apply(validate: () => Unit): ModelField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[ModelField]
    }
    
    extension [Self <: ModelField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  trait NumberField extends StObject {
    
    def validate(): Unit
  }
  object NumberField {
    
    inline def apply(validate: () => Unit): NumberField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[NumberField]
    }
    
    extension [Self <: NumberField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  trait StringField extends StObject {
    
    def validate(): Unit
  }
  object StringField {
    
    inline def apply(validate: () => Unit): StringField = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[StringField]
    }
    
    extension [Self <: StringField](x: Self) {
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
}
