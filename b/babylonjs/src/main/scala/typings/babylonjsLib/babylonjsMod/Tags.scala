package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store custom tags
  */
@JSImport("babylonjs", "Tags")
@js.native
class Tags ()
  extends babylonjsLib.BABYLONNs.Tags

/* static members */
@JSImport("babylonjs", "Tags")
@js.native
object Tags extends js.Object {
  /**
    * Adds tags to an object
    * @param obj defines the object to use
    * @param tagsString defines the tag string. The tags 'true' and 'false' are reserved and cannot be used as tags.
    * A tag cannot start with '||', '&&', and '!'. It cannot contain whitespaces
    */
  def AddTagsTo(obj: js.Any, tagsString: java.lang.String): scala.Unit = js.native
  /**
    * Removes tags support
    * @param obj defines the object to use
    */
  def DisableFor(obj: js.Any): scala.Unit = js.native
  /**
    * Adds support for tags on the given object
    * @param obj defines the object to use
    */
  def EnableFor(obj: js.Any): scala.Unit = js.native
  /**
    * Gets the tags available on a given object
    * @param obj defines the object to use
    * @param asString defines if the tags must be returned as a string instead of an array of strings
    * @returns the tags
    */
  def GetTags(obj: js.Any): js.Any = js.native
  def GetTags(obj: js.Any, asString: scala.Boolean): js.Any = js.native
  /**
    * Gets a boolean indicating if the given object has tags
    * @param obj defines the object to use
    * @returns a boolean
    */
  def HasTags(obj: js.Any): scala.Boolean = js.native
  /**
    * Defines if tags hosted on an object match a given query
    * @param obj defines the object to use
    * @param tagsQuery defines the tag query
    * @returns a boolean
    */
  def MatchesQuery(obj: js.Any, tagsQuery: java.lang.String): scala.Boolean = js.native
  /**
    * Removes specific tags from a specific object
    * @param obj defines the object to use
    * @param tagsString defines the tags to remove
    */
  def RemoveTagsFrom(obj: js.Any, tagsString: java.lang.String): scala.Unit = js.native
  /**
    * @hidden
    */
  def _AddTagTo(obj: js.Any, tag: java.lang.String): scala.Unit = js.native
  /**
    * @hidden
    */
  def _RemoveTagFrom(obj: js.Any, tag: java.lang.String): scala.Unit = js.native
}

