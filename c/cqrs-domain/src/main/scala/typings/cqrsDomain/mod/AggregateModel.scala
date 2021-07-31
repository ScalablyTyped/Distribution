package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// region AggregateModel and Command
@js.native
trait AggregateModel extends StObject {
  
  /**
    * Adds/Saves an uncommitted event.
    * @param evt The event object.
    */
  def addUncommittedEvent(evt: js.Any): Unit = js.native
  
  @JSName("apply")
  def apply(event: js.Any): Unit = js.native
  @JSName("apply")
  def apply(event: js.Any, data: js.Any): Unit = js.native
  @JSName("apply")
  def apply(event: js.Any, data: js.Any, version: Double): Unit = js.native
  @JSName("apply")
  def apply(event: js.Any, data: Unit, version: Double): Unit = js.native
  
  var attributes: js.Any = js.native
  
  /**
    * Clears the internal uncomitted event list.
    */
  def clearUncommittedEvents(): Unit = js.native
  
  /**
    * Marks this aggregate as destroyed.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets an attribute of the vm.
    * @param attr The attribute name.
    * @return The result value.
    *
    * @example:
    *     aggregate.get('firstname'); // returns 'Jack'
    */
  def get(attr: String): js.Any = js.native
  
  /**
    * Returns the revision of this aggregate.
    * @param streamInfo The stream info.
    */
  def getRevision(streamInfo: js.Any): Double = js.native
  
  /**
    * Returns all uncommitted events.
    */
  def getUncommittedEvents(): js.Array[js.Any] = js.native
  
  /**
    * Returns `true` if the attribute contains a value that is not null
    * or undefined.
    * @param attr The attribute name.
    * @return The result value.
    *
    * @example:
    *     aggregate.has('firstname'); // returns true or false
    */
  def has(attr: String): Boolean = js.native
  
  var id: String = js.native
  
  /**
    * Returns true if this aggregate is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Resets the attributes for the aggregate.
    */
  def reset(data: js.Any): Unit = js.native
  
  /**
    * Sets attributes for the aggregate.
    *
    * @example:
    *     aggregate.set('firstname', 'Jack');
    *     // or
    *     aggregate.set({
    *          firstname: 'Jack',
    *          lastname: 'X-Man'
    *     });
    */
  def set(attribute: js.Any): Unit = js.native
  def set(attribute: js.Any, value: js.Any): Unit = js.native
  
  /**
    * Sets the revision for this aggregate.
    * @param streamInfo The stream info.
    * @param rev        The revision number.
    */
  def setRevision(streamInfo: js.Any, rev: Double): Unit = js.native
  
  /**
    * The toJSON function will be called when JSON.stringify().
    * @return A clean Javascript object containing all attributes.
    */
  def toJSON(): js.Any = js.native
  
  var uncommittedEvents: js.Array[js.Any] = js.native
}
