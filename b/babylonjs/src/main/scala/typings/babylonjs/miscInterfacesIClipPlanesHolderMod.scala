package typings.babylonjs

import typings.babylonjs.mathsMathMod.Plane
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscInterfacesIClipPlanesHolderMod {
  
  trait IClipPlanesHolder extends StObject {
    
    /**
      * Gets or sets the active clipplane 1
      */
    var clipPlane: Nullable[Plane]
    
    /**
      * Gets or sets the active clipplane 2
      */
    var clipPlane2: Nullable[Plane]
    
    /**
      * Gets or sets the active clipplane 3
      */
    var clipPlane3: Nullable[Plane]
    
    /**
      * Gets or sets the active clipplane 4
      */
    var clipPlane4: Nullable[Plane]
    
    /**
      * Gets or sets the active clipplane 5
      */
    var clipPlane5: Nullable[Plane]
    
    /**
      * Gets or sets the active clipplane 6
      */
    var clipPlane6: Nullable[Plane]
  }
  object IClipPlanesHolder {
    
    inline def apply(): IClipPlanesHolder = {
      val __obj = js.Dynamic.literal(clipPlane = null, clipPlane2 = null, clipPlane3 = null, clipPlane4 = null, clipPlane5 = null, clipPlane6 = null)
      __obj.asInstanceOf[IClipPlanesHolder]
    }
    
    extension [Self <: IClipPlanesHolder](x: Self) {
      
      inline def setClipPlane(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
      
      inline def setClipPlane2(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane2", value.asInstanceOf[js.Any])
      
      inline def setClipPlane2Null: Self = StObject.set(x, "clipPlane2", null)
      
      inline def setClipPlane3(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane3", value.asInstanceOf[js.Any])
      
      inline def setClipPlane3Null: Self = StObject.set(x, "clipPlane3", null)
      
      inline def setClipPlane4(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane4", value.asInstanceOf[js.Any])
      
      inline def setClipPlane4Null: Self = StObject.set(x, "clipPlane4", null)
      
      inline def setClipPlane5(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane5", value.asInstanceOf[js.Any])
      
      inline def setClipPlane5Null: Self = StObject.set(x, "clipPlane5", null)
      
      inline def setClipPlane6(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane6", value.asInstanceOf[js.Any])
      
      inline def setClipPlane6Null: Self = StObject.set(x, "clipPlane6", null)
      
      inline def setClipPlaneNull: Self = StObject.set(x, "clipPlane", null)
    }
  }
}
