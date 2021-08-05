package typings.box2d.Box2D.Collision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  /**
    * A value of 1 indicates that the reference edge is on shape2.
    **/
  var flip: Double
  
  /**
    * The edge most anti-parallel to the reference edge.
    **/
  var incidentEdge: Double
  
  /**
    * The vertex (0 or 1) on the incident edge that was clipped.
    **/
  var incidentVertex: Double
  
  /**
    * The edge that defines the outward contact normal.
    **/
  var referenceEdge: Double
}
object Features {
  
  inline def apply(flip: Double, incidentEdge: Double, incidentVertex: Double, referenceEdge: Double): Features = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], incidentEdge = incidentEdge.asInstanceOf[js.Any], incidentVertex = incidentVertex.asInstanceOf[js.Any], referenceEdge = referenceEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setFlip(value: Double): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setIncidentEdge(value: Double): Self = StObject.set(x, "incidentEdge", value.asInstanceOf[js.Any])
    
    inline def setIncidentVertex(value: Double): Self = StObject.set(x, "incidentVertex", value.asInstanceOf[js.Any])
    
    inline def setReferenceEdge(value: Double): Self = StObject.set(x, "referenceEdge", value.asInstanceOf[js.Any])
  }
}
