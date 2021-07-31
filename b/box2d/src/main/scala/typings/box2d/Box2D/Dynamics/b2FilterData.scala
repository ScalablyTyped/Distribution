package typings.box2d.Box2D.Dynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2FilterData extends StObject {
  
  /**
    * Creates a copy of the filter data.
    * @return Copy of this filter data.
    **/
  def Copy(): b2FilterData
  
  /**
    * The collision category bits. Normally you would just set one bit.
    **/
  var categoryBits: Double
  
  /**
    * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
    **/
  var groupIndex: Double
  
  /**
    * The collision mask bits. This states the categories that this shape would accept for collision.
    **/
  var maskBits: Double
}
object b2FilterData {
  
  @scala.inline
  def apply(Copy: () => b2FilterData, categoryBits: Double, groupIndex: Double, maskBits: Double): b2FilterData = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), categoryBits = categoryBits.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], maskBits = maskBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FilterData]
  }
  
  @scala.inline
  implicit class b2FilterDataMutableBuilder[Self <: b2FilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryBits(value: Double): Self = StObject.set(x, "categoryBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => b2FilterData): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBits(value: Double): Self = StObject.set(x, "maskBits", value.asInstanceOf[js.Any])
  }
}
