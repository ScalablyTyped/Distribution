package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceSpaceConfiguration extends StObject {
  
  /**
    * Specifies whether Amazon Kendra should index archived spaces.
    */
  var CrawlArchivedSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal spaces. If personal spaces are indexed, queries without user context information may return restricted items from a personal space in their results. For more information, see Filtering on user context.
    */
  var CrawlPersonalSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are not indexed. If a space is in both the ExcludeSpaces and the IncludeSpaces list, the space is excluded.
    */
  var ExcludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined
  
  /**
    * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the IncludeSpaces and the ExcludeSpaces list, the space is excluded.
    */
  var IncludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined
  
  /**
    * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the SpaceFieldMappings parameter, you must specify at least one field mapping.
    */
  var SpaceFieldMappings: js.UndefOr[ConfluenceSpaceFieldMappingsList] = js.undefined
}
object ConfluenceSpaceConfiguration {
  
  @scala.inline
  def apply(): ConfluenceSpaceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceSpaceConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceSpaceConfigurationMutableBuilder[Self <: ConfluenceSpaceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlArchivedSpaces(value: Boolean): Self = StObject.set(x, "CrawlArchivedSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlArchivedSpacesUndefined: Self = StObject.set(x, "CrawlArchivedSpaces", js.undefined)
    
    @scala.inline
    def setCrawlPersonalSpaces(value: Boolean): Self = StObject.set(x, "CrawlPersonalSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlPersonalSpacesUndefined: Self = StObject.set(x, "CrawlPersonalSpaces", js.undefined)
    
    @scala.inline
    def setExcludeSpaces(value: ConfluenceSpaceList): Self = StObject.set(x, "ExcludeSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSpacesUndefined: Self = StObject.set(x, "ExcludeSpaces", js.undefined)
    
    @scala.inline
    def setExcludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = StObject.set(x, "ExcludeSpaces", js.Array(value :_*))
    
    @scala.inline
    def setIncludeSpaces(value: ConfluenceSpaceList): Self = StObject.set(x, "IncludeSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSpacesUndefined: Self = StObject.set(x, "IncludeSpaces", js.undefined)
    
    @scala.inline
    def setIncludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = StObject.set(x, "IncludeSpaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaceFieldMappings(value: ConfluenceSpaceFieldMappingsList): Self = StObject.set(x, "SpaceFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceFieldMappingsUndefined: Self = StObject.set(x, "SpaceFieldMappings", js.undefined)
    
    @scala.inline
    def setSpaceFieldMappingsVarargs(value: ConfluenceSpaceToIndexFieldMapping*): Self = StObject.set(x, "SpaceFieldMappings", js.Array(value :_*))
  }
}
