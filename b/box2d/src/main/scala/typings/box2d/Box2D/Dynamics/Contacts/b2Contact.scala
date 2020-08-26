package typings.box2d.Box2D.Dynamics.Contacts

import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Collision.b2WorldManifold
import typings.box2d.Box2D.Dynamics.b2Fixture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Contact extends js.Object {
  /**
    * Flag this contact for filtering. Filtering will occur the next time step.
    **/
  def FlagForFiltering(): Unit = js.native
  /**
    * Get the first fixture in this contact.
    * @return First fixture in this contact.
    **/
  def GetFixtureA(): b2Fixture = js.native
  /**
    * Get the second fixture in this contact.
    * @return Second fixture in this contact.
    **/
  def GetFixtureB(): b2Fixture = js.native
  /**
    * Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
    * @return Contact manifold.
    **/
  def GetManifold(): b2Manifold = js.native
  /**
    * Get the next contact in the world's contact list.
    * @return Next contact in the world's contact list.
    **/
  def GetNext(): b2Contact = js.native
  /**
    * Get the world manifold.
    * @param worldManifold World manifold out.
    * @return World manifold.
    **/
  def GetWorldManifold(worldManifold: b2WorldManifold): Unit = js.native
  /**
    * Does this contact generate TOI events for continuous simulation.
    * @return True for continous, otherwise false.
    **/
  def IsContinuous(): Boolean = js.native
  /**
    * Has this contact been disabled?
    * @return True if disabled, otherwise false.
    **/
  def IsEnabled(): Boolean = js.native
  /**
    * Is this contact a sensor?
    * @return True if sensor, otherwise false.
    **/
  def IsSensor(): Boolean = js.native
  /**
    * Is this contact touching.
    * @return True if contact is touching, otherwise false.
    **/
  def IsTouching(): Boolean = js.native
  /**
    * Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
    * @param flag True to enable, false to disable.
    **/
  def SetEnabled(flag: Boolean): Unit = js.native
  /**
    * Change this to be a sensor or-non-sensor contact.
    * @param sensor True to be sensor, false to not be a sensor.
    **/
  def SetSensor(sensor: Boolean): Unit = js.native
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
  implicit class b2ContactOps[Self <: b2Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlagForFiltering(value: () => Unit): Self = this.set("FlagForFiltering", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFixtureA(value: () => b2Fixture): Self = this.set("GetFixtureA", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFixtureB(value: () => b2Fixture): Self = this.set("GetFixtureB", js.Any.fromFunction0(value))
    @scala.inline
    def setGetManifold(value: () => b2Manifold): Self = this.set("GetManifold", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNext(value: () => b2Contact): Self = this.set("GetNext", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorldManifold(value: b2WorldManifold => Unit): Self = this.set("GetWorldManifold", js.Any.fromFunction1(value))
    @scala.inline
    def setIsContinuous(value: () => Boolean): Self = this.set("IsContinuous", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("IsEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSensor(value: () => Boolean): Self = this.set("IsSensor", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTouching(value: () => Boolean): Self = this.set("IsTouching", js.Any.fromFunction0(value))
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("SetEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSensor(value: Boolean => Unit): Self = this.set("SetSensor", js.Any.fromFunction1(value))
  }
  
}

