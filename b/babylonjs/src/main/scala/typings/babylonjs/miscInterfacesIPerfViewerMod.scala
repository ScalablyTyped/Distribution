package typings.babylonjs

import typings.babylonjs.miscPerformanceViewerDynamicFloat32ArrayMod.DynamicFloat32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscInterfacesIPerfViewerMod {
  
  trait IPerfCustomEvent extends StObject {
    
    /**
      * The name of the event.
      */
    var name: String
    
    /**
      * The value for the event, if set we will use it as the value, otherwise we will count the number of occurrences.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object IPerfCustomEvent {
    
    inline def apply(name: String): IPerfCustomEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerfCustomEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPerfCustomEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IPerfDatasets extends StObject {
    
    /**
      * The data to be processed by the performance graph. Each slice will be of the form of [timestamp, numberOfPoints, value1, value2...]
      */
    var data: DynamicFloat32Array
    
    /**
      * The ids of our dataset.
      */
    var ids: js.Array[String]
    
    /**
      * A list of starting indices for each slice of data collected. Used for fast access of an arbitrary slice inside the data array.
      */
    var startingIndices: DynamicFloat32Array
  }
  object IPerfDatasets {
    
    inline def apply(data: DynamicFloat32Array, ids: js.Array[String], startingIndices: DynamicFloat32Array): IPerfDatasets = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], startingIndices = startingIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPerfDatasets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPerfDatasets] (val x: Self) extends AnyVal {
      
      inline def setData(value: DynamicFloat32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setStartingIndices(value: DynamicFloat32Array): Self = StObject.set(x, "startingIndices", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPerfMetadata extends StObject {
    
    /**
      * Specifies the category of the data
      */
    var category: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the line to be drawn.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies if data should be hidden, falsey by default.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
  }
  object IPerfMetadata {
    
    inline def apply(): IPerfMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPerfMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPerfMetadata] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    }
  }
}
