package typings.cyclonedx.mod

import typings.cyclonedx.anon.Id
import typings.cyclonedx.anon.Locale
import typings.cyclonedx.anon.Name
import typings.cyclonedx.cyclonedxStrings.`pre-release`
import typings.cyclonedx.cyclonedxStrings.internal
import typings.cyclonedx.cyclonedxStrings.major
import typings.cyclonedx.cyclonedxStrings.minor
import typings.cyclonedx.cyclonedxStrings.patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseNotes extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var featuredImage: js.UndefOr[URL] = js.undefined
  
  var notes: js.UndefOr[js.Array[Locale]] = js.undefined
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var resolves: js.UndefOr[js.Array[Id]] = js.undefined
  
  var socialImage: js.UndefOr[URL] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var timestamp: js.UndefOr[Timestamp] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: major | minor | patch | `pre-release` | internal
}
object ReleaseNotes {
  
  inline def apply(`type`: major | minor | patch | `pre-release` | internal): ReleaseNotes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseNotes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseNotes] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeaturedImage(value: URL): Self = StObject.set(x, "featuredImage", value.asInstanceOf[js.Any])
    
    inline def setFeaturedImageUndefined: Self = StObject.set(x, "featuredImage", js.undefined)
    
    inline def setNotes(value: js.Array[Locale]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: Locale*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setResolves(value: js.Array[Id]): Self = StObject.set(x, "resolves", value.asInstanceOf[js.Any])
    
    inline def setResolvesUndefined: Self = StObject.set(x, "resolves", js.undefined)
    
    inline def setResolvesVarargs(value: Id*): Self = StObject.set(x, "resolves", js.Array(value*))
    
    inline def setSocialImage(value: URL): Self = StObject.set(x, "socialImage", value.asInstanceOf[js.Any])
    
    inline def setSocialImageUndefined: Self = StObject.set(x, "socialImage", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: major | minor | patch | `pre-release` | internal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
