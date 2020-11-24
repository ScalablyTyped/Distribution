package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceSpaceConfiguration extends js.Object {
  
  /**
    * Specifies whether Amazon Kendra should index archived spaces.
    */
  var CrawlArchivedSpaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether Amazon Kendra should index personal spaces. Users can add restrictions to items in personal spaces. If personal spaces are indexed, queries without user context information may return restricted items from a personal space in their results. For more information, see Filtering on user context.
    */
  var CrawlPersonalSpaces: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of space keys of Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are not indexed. If a space is in both the ExcludeSpaces and the IncludeSpaces list, the space is excluded.
    */
  var ExcludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.native
  
  /**
    * A list of space keys for Confluence spaces. If you include a key, the blogs, documents, and attachments in the space are indexed. Spaces that aren't in the list aren't indexed. A space in the list must exist. Otherwise, Amazon Kendra logs an error when the data source is synchronized. If a space is in both the IncludeSpaces and the ExcludeSpaces list, the space is excluded.
    */
  var IncludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.native
  
  /**
    * Defines how space metadata fields should be mapped to index fields. Before you can map a field, you must first create an index field with a matching type using the console or the UpdateIndex operation. If you specify the SpaceFieldMappings parameter, you must specify at least one field mapping.
    */
  var SpaceFieldMappings: js.UndefOr[ConfluenceSpaceFieldMappingsList] = js.native
}
object ConfluenceSpaceConfiguration {
  
  @scala.inline
  def apply(): ConfluenceSpaceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceSpaceConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceSpaceConfigurationOps[Self <: ConfluenceSpaceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrawlArchivedSpaces(value: Boolean): Self = this.set("CrawlArchivedSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlArchivedSpaces: Self = this.set("CrawlArchivedSpaces", js.undefined)
    
    @scala.inline
    def setCrawlPersonalSpaces(value: Boolean): Self = this.set("CrawlPersonalSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlPersonalSpaces: Self = this.set("CrawlPersonalSpaces", js.undefined)
    
    @scala.inline
    def setExcludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = this.set("ExcludeSpaces", js.Array(value :_*))
    
    @scala.inline
    def setExcludeSpaces(value: ConfluenceSpaceList): Self = this.set("ExcludeSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeSpaces: Self = this.set("ExcludeSpaces", js.undefined)
    
    @scala.inline
    def setIncludeSpacesVarargs(value: ConfluenceSpaceIdentifier*): Self = this.set("IncludeSpaces", js.Array(value :_*))
    
    @scala.inline
    def setIncludeSpaces(value: ConfluenceSpaceList): Self = this.set("IncludeSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSpaces: Self = this.set("IncludeSpaces", js.undefined)
    
    @scala.inline
    def setSpaceFieldMappingsVarargs(value: ConfluenceSpaceToIndexFieldMapping*): Self = this.set("SpaceFieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setSpaceFieldMappings(value: ConfluenceSpaceFieldMappingsList): Self = this.set("SpaceFieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceFieldMappings: Self = this.set("SpaceFieldMappings", js.undefined)
  }
}
