package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Collision.b2ContactID
import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Collision.b2WorldManifold
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Contacts {
  
  trait b2Contact extends StObject {
    
    /**
      * Flag this contact for filtering. Filtering will occur the next time step.
      **/
    def FlagForFiltering(): Unit
    
    /**
      * Get the first fixture in this contact.
      * @return First fixture in this contact.
      **/
    def GetFixtureA(): b2Fixture
    
    /**
      * Get the second fixture in this contact.
      * @return Second fixture in this contact.
      **/
    def GetFixtureB(): b2Fixture
    
    /**
      * Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
      * @return Contact manifold.
      **/
    def GetManifold(): b2Manifold
    
    /**
      * Get the next contact in the world's contact list.
      * @return Next contact in the world's contact list.
      **/
    def GetNext(): b2Contact
    
    /**
      * Get the world manifold.
      * @param worldManifold World manifold out.
      * @return World manifold.
      **/
    def GetWorldManifold(worldManifold: b2WorldManifold): Unit
    
    /**
      * Does this contact generate TOI events for continuous simulation.
      * @return True for continous, otherwise false.
      **/
    def IsContinuous(): Boolean
    
    /**
      * Has this contact been disabled?
      * @return True if disabled, otherwise false.
      **/
    def IsEnabled(): Boolean
    
    /**
      * Is this contact a sensor?
      * @return True if sensor, otherwise false.
      **/
    def IsSensor(): Boolean
    
    /**
      * Is this contact touching.
      * @return True if contact is touching, otherwise false.
      **/
    def IsTouching(): Boolean
    
    /**
      * Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
      * @param flag True to enable, false to disable.
      **/
    def SetEnabled(flag: Boolean): Unit
    
    /**
      * Change this to be a sensor or-non-sensor contact.
      * @param sensor True to be sensor, false to not be a sensor.
      **/
    def SetSensor(sensor: Boolean): Unit
  }
  object b2Contact {
    
    @scala.inline
    def apply(
      FlagForFiltering: () => Unit,
      GetFixtureA: () => b2Fixture,
      GetFixtureB: () => b2Fixture,
      GetManifold: () => b2Manifold,
      GetNext: () => b2Contact,
      GetWorldManifold: b2WorldManifold => Unit,
      IsContinuous: () => Boolean,
      IsEnabled: () => Boolean,
      IsSensor: () => Boolean,
      IsTouching: () => Boolean,
      SetEnabled: Boolean => Unit,
      SetSensor: Boolean => Unit
    ): b2Contact = {
      val __obj = js.Dynamic.literal(FlagForFiltering = js.Any.fromFunction0(FlagForFiltering), GetFixtureA = js.Any.fromFunction0(GetFixtureA), GetFixtureB = js.Any.fromFunction0(GetFixtureB), GetManifold = js.Any.fromFunction0(GetManifold), GetNext = js.Any.fromFunction0(GetNext), GetWorldManifold = js.Any.fromFunction1(GetWorldManifold), IsContinuous = js.Any.fromFunction0(IsContinuous), IsEnabled = js.Any.fromFunction0(IsEnabled), IsSensor = js.Any.fromFunction0(IsSensor), IsTouching = js.Any.fromFunction0(IsTouching), SetEnabled = js.Any.fromFunction1(SetEnabled), SetSensor = js.Any.fromFunction1(SetSensor))
      __obj.asInstanceOf[b2Contact]
    }
    
    @scala.inline
    implicit class b2ContactMutableBuilder[Self <: b2Contact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlagForFiltering(value: () => Unit): Self = StObject.set(x, "FlagForFiltering", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFixtureA(value: () => b2Fixture): Self = StObject.set(x, "GetFixtureA", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFixtureB(value: () => b2Fixture): Self = StObject.set(x, "GetFixtureB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetManifold(value: () => b2Manifold): Self = StObject.set(x, "GetManifold", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNext(value: () => b2Contact): Self = StObject.set(x, "GetNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWorldManifold(value: b2WorldManifold => Unit): Self = StObject.set(x, "GetWorldManifold", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsContinuous(value: () => Boolean): Self = StObject.set(x, "IsContinuous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "IsEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSensor(value: () => Boolean): Self = StObject.set(x, "IsSensor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTouching(value: () => Boolean): Self = StObject.set(x, "IsTouching", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSensor(value: Boolean => Unit): Self = StObject.set(x, "SetSensor", js.Any.fromFunction1(value))
    }
  }
  
  trait b2ContactEdge extends StObject {
    
    /**
      * Contact.
      **/
    var contact: b2Contact
    
    /**
      * Next contact edge.
      **/
    var next: b2ContactEdge
    
    /**
      * Contact body.
      **/
    var other: b2Body
    
    /**
      * Previous contact edge.
      **/
    var prev: b2ContactEdge
  }
  object b2ContactEdge {
    
    @scala.inline
    def apply(contact: b2Contact, next: b2ContactEdge, other: b2Body, prev: b2ContactEdge): b2ContactEdge = {
      val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ContactEdge]
    }
    
    @scala.inline
    implicit class b2ContactEdgeMutableBuilder[Self <: b2ContactEdge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContact(value: b2Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: b2ContactEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: b2Body): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: b2ContactEdge): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2ContactResult extends StObject {
    
    /**
      * The contact id identifies the features in contact.
      **/
    var id: b2ContactID
    
    /**
      * Points from shape1 to shape2.
      **/
    var normal: b2Vec2
    
    /**
      * The normal impulse applied to body2.
      **/
    var normalImpulse: Double
    
    /**
      * Position in world coordinates.
      **/
    var position: b2Vec2
    
    /**
      * The first shape.
      **/
    var shape1: b2Shape
    
    /**
      * The second shape.
      **/
    var shape2: b2Shape
    
    /**
      * The tangent impulse applied to body2.
      **/
    var tangentImpulse: Double
  }
  object b2ContactResult {
    
    @scala.inline
    def apply(
      id: b2ContactID,
      normal: b2Vec2,
      normalImpulse: Double,
      position: b2Vec2,
      shape1: b2Shape,
      shape2: b2Shape,
      tangentImpulse: Double
    ): b2ContactResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalImpulse = normalImpulse.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape1 = shape1.asInstanceOf[js.Any], shape2 = shape2.asInstanceOf[js.Any], tangentImpulse = tangentImpulse.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ContactResult]
    }
    
    @scala.inline
    implicit class b2ContactResultMutableBuilder[Self <: b2ContactResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: b2ContactID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalImpulse(value: Double): Self = StObject.set(x, "normalImpulse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape1(value: b2Shape): Self = StObject.set(x, "shape1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape2(value: b2Shape): Self = StObject.set(x, "shape2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTangentImpulse(value: Double): Self = StObject.set(x, "tangentImpulse", value.asInstanceOf[js.Any])
    }
  }
}
