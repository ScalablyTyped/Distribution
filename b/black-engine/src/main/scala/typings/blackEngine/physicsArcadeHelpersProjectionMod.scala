package typings.blackEngine

import typings.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsArcadeHelpersProjectionMod {
  
  @JSImport("black-engine/physics/arcade/helpers/Projection", "Projection")
  @js.native
  open class Projection () extends StObject {
    
    /* private */ var axis: Any = js.native
    
    /* private */ var offset: Any = js.native
    
    /* private */ var rangeA: Any = js.native
    
    /* private */ var rangeB: Any = js.native
    
    def refresh(): Unit = js.native
    
    def set(verticesA: js.Array[Vector], verticesB: js.Array[Vector], axis: Vector): Unit = js.native
    
    /* private */ var verticesA: Any = js.native
    
    /* private */ var verticesB: Any = js.native
  }
  /* static members */
  object Projection {
    
    @JSImport("black-engine/physics/arcade/helpers/Projection", "Projection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/physics/arcade/helpers/Projection", "Projection.__project")
    @js.native
    def __project: Any = js.native
    inline def __project_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__project")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("black-engine/physics/arcade/helpers/Projection", "Range")
  @js.native
  open class Range () extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
  }
}
