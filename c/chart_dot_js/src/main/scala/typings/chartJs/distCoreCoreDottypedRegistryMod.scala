package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDottypedRegistryMod {
  
  @JSImport("chart.js/dist/core/core.typedRegistry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TypedRegistry {
    def this(`type`: Any, scope: Any, `override`: Any) = this()
    
    /**
      * @param {string} id
      * @returns {object?}
      */
    /* CompleteClass */
    override def get(id: String): js.Object | Null = js.native
    
    /* CompleteClass */
    override def isForType(`type`: Any): Boolean = js.native
    
    /* CompleteClass */
    var items: Any = js.native
    
    /* CompleteClass */
    var `override`: Any = js.native
    
    /**
      * @param {IChartComponent} item
      * @returns {string} The scope where items defaults were registered to.
      */
    /* CompleteClass */
    override def register(item: IChartComponent): String = js.native
    
    /* CompleteClass */
    var scope: Any = js.native
    
    /* CompleteClass */
    var `type`: Any = js.native
    
    /**
      * @param {IChartComponent} item
      */
    /* CompleteClass */
    override def unregister(item: IChartComponent): Unit = js.native
  }
  
  trait IChartComponent extends StObject {
    
    var defaultRoutes: Any
    
    var defaults: Any
    
    var id: String
    
    var overrides: js.UndefOr[Any] = js.undefined
  }
  object IChartComponent {
    
    inline def apply(defaultRoutes: Any, defaults: Any, id: String): IChartComponent = {
      val __obj = js.Dynamic.literal(defaultRoutes = defaultRoutes.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChartComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IChartComponent] (val x: Self) extends AnyVal {
      
      inline def setDefaultRoutes(value: Any): Self = StObject.set(x, "defaultRoutes", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait TypedRegistry extends StObject {
    
    /**
      * @param {string} id
      * @returns {object?}
      */
    def get(id: String): js.Object | Null
    
    def isForType(`type`: Any): Boolean
    
    var items: Any
    
    var `override`: Any
    
    /**
      * @param {IChartComponent} item
      * @returns {string} The scope where items defaults were registered to.
      */
    def register(item: IChartComponent): String
    
    var scope: Any
    
    var `type`: Any
    
    /**
      * @param {IChartComponent} item
      */
    def unregister(item: IChartComponent): Unit
  }
  object TypedRegistry {
    
    inline def apply(
      get: String => js.Object | Null,
      isForType: Any => Boolean,
      items: Any,
      `override`: Any,
      register: IChartComponent => String,
      scope: Any,
      `type`: Any,
      unregister: IChartComponent => Unit
    ): TypedRegistry = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isForType = js.Any.fromFunction1(isForType), items = items.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), scope = scope.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedRegistry] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => js.Object | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIsForType(value: Any => Boolean): Self = StObject.set(x, "isForType", js.Any.fromFunction1(value))
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setOverride(value: Any): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setRegister(value: IChartComponent => String): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnregister(value: IChartComponent => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
}
