package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region AggregateModel and Command
@js.native
trait AggregateModel extends js.Object {
  var attributes: js.Any = js.native
  var id: java.lang.String = js.native
  var uncommittedEvents: js.Array[_] = js.native
  /**
           * Adds/Saves an uncommitted event.
           * @param evt The event object.
           */
  def addUncommittedEvent(evt: js.Any): scala.Unit = js.native
  @JSName("apply")
  def apply(event: js.Any): scala.Unit = js.native
  @JSName("apply")
  def apply(event: js.Any, data: js.Any): scala.Unit = js.native
  @JSName("apply")
  def apply(event: js.Any, data: js.Any, version: scala.Double): scala.Unit = js.native
  /**
           * Clears the internal uncomitted event list.
           */
  def clearUncommittedEvents(): scala.Unit = js.native
  /**
           * Marks this aggregate as destroyed.
           */
  def destroy(): scala.Unit = js.native
  /**
           * Gets an attribute of the vm.
           * @param attr The attribute name.
           * @return The result value.
           *
           * @example:
           *     aggregate.get('firstname'); // returns 'Jack'
           */
  def get(attr: java.lang.String): js.Any = js.native
  /**
           * Returns the revision of this aggregate.
           * @param streamInfo The stream info.
           */
  def getRevision(streamInfo: js.Any): scala.Double = js.native
  /**
           * Returns all uncommitted events.
           */
  def getUncommittedEvents(): js.Array[_] = js.native
  /**
           * Returns `true` if the attribute contains a value that is not null
           * or undefined.
           * @param attr The attribute name.
           * @return The result value.
           *
           * @example:
           *     aggregate.has('firstname'); // returns true or false
           */
  def has(attr: java.lang.String): scala.Boolean = js.native
  /**
           * Returns true if this aggregate is destroyed.
           */
  def isDestroyed(): scala.Boolean = js.native
  /**
           * Resets the attributes for the aggregate.
           */
  def reset(data: js.Any): scala.Unit = js.native
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
  def set(attribute: js.Any): scala.Unit = js.native
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
  def set(attribute: js.Any, value: js.Any): scala.Unit = js.native
  /**
           * Sets the revision for this aggregate.
           * @param streamInfo The stream info.
           * @param rev        The revision number.
           */
  def setRevision(streamInfo: js.Any, rev: scala.Double): scala.Unit = js.native
  /**
           * The toJSON function will be called when JSON.stringify().
           * @return A clean Javascript object containing all attributes.
           */
  def toJSON(): js.Any = js.native
}

