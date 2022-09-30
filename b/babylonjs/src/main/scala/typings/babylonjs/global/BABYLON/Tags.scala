package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Tags")
@js.native
open class Tags ()
  extends StObject
     with typings.babylonjs.BABYLON.Tags
/* static members */
object Tags {
  
  @JSGlobal("BABYLON.Tags")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds tags to an object
    * @param obj defines the object to use
    * @param tagsString defines the tag string. The tags 'true' and 'false' are reserved and cannot be used as tags.
    * A tag cannot start with '||', '&&', and '!'. It cannot contain whitespaces
    */
  inline def AddTagsTo(obj: Any, tagsString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddTagsTo")(obj.asInstanceOf[js.Any], tagsString.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes tags support
    * @param obj defines the object to use
    */
  inline def DisableFor(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DisableFor")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Adds support for tags on the given object
    * @param obj defines the object to use
    */
  inline def EnableFor(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EnableFor")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets the tags available on a given object
    * @param obj defines the object to use
    * @param asString defines if the tags must be returned as a string instead of an array of strings
    * @returns the tags
    */
  inline def GetTags(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTags")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def GetTags(obj: Any, asString: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTags")(obj.asInstanceOf[js.Any], asString.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Gets a boolean indicating if the given object has tags
    * @param obj defines the object to use
    * @returns a boolean
    */
  inline def HasTags(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasTags")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Defines if tags hosted on an object match a given query
    * @param obj defines the object to use
    * @param tagsQuery defines the tag query
    * @returns a boolean
    */
  inline def MatchesQuery(obj: Any, tagsQuery: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("MatchesQuery")(obj.asInstanceOf[js.Any], tagsQuery.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Removes specific tags from a specific object
    * @param obj defines the object to use
    * @param tagsString defines the tags to remove
    */
  inline def RemoveTagsFrom(obj: Any, tagsString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveTagsFrom")(obj.asInstanceOf[js.Any], tagsString.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _AddTagTo(obj: Any, tag: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_AddTagTo")(obj.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _RemoveTagFrom(obj: Any, tag: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_RemoveTagFrom")(obj.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
