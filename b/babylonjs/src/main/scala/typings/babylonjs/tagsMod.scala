package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsMod {
  
  @JSImport("babylonjs/Misc/tags", "Tags")
  @js.native
  class Tags () extends StObject
  /* static members */
  object Tags {
    
    /**
      * Adds tags to an object
      * @param obj defines the object to use
      * @param tagsString defines the tag string. The tags 'true' and 'false' are reserved and cannot be used as tags.
      * A tag cannot start with '||', '&&', and '!'. It cannot contain whitespaces
      */
    @JSImport("babylonjs/Misc/tags", "Tags.AddTagsTo")
    @js.native
    def AddTagsTo(obj: js.Any, tagsString: String): Unit = js.native
    
    /**
      * Removes tags support
      * @param obj defines the object to use
      */
    @JSImport("babylonjs/Misc/tags", "Tags.DisableFor")
    @js.native
    def DisableFor(obj: js.Any): Unit = js.native
    
    /**
      * Adds support for tags on the given object
      * @param obj defines the object to use
      */
    @JSImport("babylonjs/Misc/tags", "Tags.EnableFor")
    @js.native
    def EnableFor(obj: js.Any): Unit = js.native
    
    /**
      * Gets the tags available on a given object
      * @param obj defines the object to use
      * @param asString defines if the tags must be returned as a string instead of an array of strings
      * @returns the tags
      */
    @JSImport("babylonjs/Misc/tags", "Tags.GetTags")
    @js.native
    def GetTags(obj: js.Any): js.Any = js.native
    @JSImport("babylonjs/Misc/tags", "Tags.GetTags")
    @js.native
    def GetTags(obj: js.Any, asString: Boolean): js.Any = js.native
    
    /**
      * Gets a boolean indicating if the given object has tags
      * @param obj defines the object to use
      * @returns a boolean
      */
    @JSImport("babylonjs/Misc/tags", "Tags.HasTags")
    @js.native
    def HasTags(obj: js.Any): Boolean = js.native
    
    /**
      * Defines if tags hosted on an object match a given query
      * @param obj defines the object to use
      * @param tagsQuery defines the tag query
      * @returns a boolean
      */
    @JSImport("babylonjs/Misc/tags", "Tags.MatchesQuery")
    @js.native
    def MatchesQuery(obj: js.Any, tagsQuery: String): Boolean = js.native
    
    /**
      * Removes specific tags from a specific object
      * @param obj defines the object to use
      * @param tagsString defines the tags to remove
      */
    @JSImport("babylonjs/Misc/tags", "Tags.RemoveTagsFrom")
    @js.native
    def RemoveTagsFrom(obj: js.Any, tagsString: String): Unit = js.native
    
    /**
      * @hidden
      */
    @JSImport("babylonjs/Misc/tags", "Tags._AddTagTo")
    @js.native
    def _AddTagTo(obj: js.Any, tag: String): Unit = js.native
    
    /**
      * @hidden
      */
    @JSImport("babylonjs/Misc/tags", "Tags._RemoveTagFrom")
    @js.native
    def _RemoveTagFrom(obj: js.Any, tag: String): Unit = js.native
  }
}
