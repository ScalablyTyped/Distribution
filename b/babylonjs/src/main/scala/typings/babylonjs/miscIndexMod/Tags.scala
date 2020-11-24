package typings.babylonjs.miscIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "Tags")
@js.native
class Tags ()
  extends typings.babylonjs.tagsMod.Tags
/* static members */
@JSImport("babylonjs/Misc/index", "Tags")
@js.native
object Tags extends js.Object {
  
  /**
    * Adds tags to an object
    * @param obj defines the object to use
    * @param tagsString defines the tag string. The tags 'true' and 'false' are reserved and cannot be used as tags.
    * A tag cannot start with '||', '&&', and '!'. It cannot contain whitespaces
    */
  def AddTagsTo(obj: js.Any, tagsString: String): Unit = js.native
  
  /**
    * Removes tags support
    * @param obj defines the object to use
    */
  def DisableFor(obj: js.Any): Unit = js.native
  
  /**
    * Adds support for tags on the given object
    * @param obj defines the object to use
    */
  def EnableFor(obj: js.Any): Unit = js.native
  
  /**
    * Gets the tags available on a given object
    * @param obj defines the object to use
    * @param asString defines if the tags must be returned as a string instead of an array of strings
    * @returns the tags
    */
  def GetTags(obj: js.Any): js.Any = js.native
  def GetTags(obj: js.Any, asString: Boolean): js.Any = js.native
  
  /**
    * Gets a boolean indicating if the given object has tags
    * @param obj defines the object to use
    * @returns a boolean
    */
  def HasTags(obj: js.Any): Boolean = js.native
  
  /**
    * Defines if tags hosted on an object match a given query
    * @param obj defines the object to use
    * @param tagsQuery defines the tag query
    * @returns a boolean
    */
  def MatchesQuery(obj: js.Any, tagsQuery: String): Boolean = js.native
  
  /**
    * Removes specific tags from a specific object
    * @param obj defines the object to use
    * @param tagsString defines the tags to remove
    */
  def RemoveTagsFrom(obj: js.Any, tagsString: String): Unit = js.native
  
  /**
    * @hidden
    */
  def _AddTagTo(obj: js.Any, tag: String): Unit = js.native
  
  /**
    * @hidden
    */
  def _RemoveTagFrom(obj: js.Any, tag: String): Unit = js.native
}
