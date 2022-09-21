package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camljs", "CamlValues")
@js.native
open class CamlValues () extends StObject
object CamlValues {
  
  @JSImport("camljs", "CamlValues")
  @js.native
  val ^ : js.Any = js.native
  
  /** Dynamic value that represents a property of the current list */
  /* static member */
  object ListProperty {
    
    @JSImport("camljs", "CamlValues.ListProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /** Date and time the list was created. */
    @JSImport("camljs", "CamlValues.ListProperty.Created")
    @js.native
    def Created: String = js.native
    inline def Created_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Created")(x.asInstanceOf[js.Any])
    
    /** Server-relative URL of the default list view. */
    @JSImport("camljs", "CamlValues.ListProperty.DefaultViewUrl")
    @js.native
    def DefaultViewUrl: String = js.native
    inline def DefaultViewUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultViewUrl")(x.asInstanceOf[js.Any])
    
    /** Description of the list. */
    @JSImport("camljs", "CamlValues.ListProperty.Description")
    @js.native
    def Description: String = js.native
    inline def Description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    /** Determines if RSS syndication is enabled for the list */
    @JSImport("camljs", "CamlValues.ListProperty.EnableSyndication")
    @js.native
    def EnableSyndication: String = js.native
    inline def EnableSyndication_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableSyndication")(x.asInstanceOf[js.Any])
    
    /** Number of items in the list */
    @JSImport("camljs", "CamlValues.ListProperty.ItemCount")
    @js.native
    def ItemCount: String = js.native
    inline def ItemCount_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(x.asInstanceOf[js.Any])
    
    /** Title linked to the list */
    @JSImport("camljs", "CamlValues.ListProperty.LinkTitle")
    @js.native
    def LinkTitle: String = js.native
    inline def LinkTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinkTitle")(x.asInstanceOf[js.Any])
    
    /** For a document library that uses version control with major versions only, maximum number of major versions allowed for items. */
    @JSImport("camljs", "CamlValues.ListProperty.MajorVersionLimit")
    @js.native
    def MajorVersionLimit: String = js.native
    inline def MajorVersionLimit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MajorVersionLimit")(x.asInstanceOf[js.Any])
    
    /** For a document library that uses version control with both major and minor versions, maximum number of major versions allowed for items. */
    @JSImport("camljs", "CamlValues.ListProperty.MajorWithMinorVersionsLimit")
    @js.native
    def MajorWithMinorVersionsLimit: String = js.native
    inline def MajorWithMinorVersionsLimit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MajorWithMinorVersionsLimit")(x.asInstanceOf[js.Any])
    
    /** Site-relative URL for the list. */
    @JSImport("camljs", "CamlValues.ListProperty.RelativeFolderPath")
    @js.native
    def RelativeFolderPath: String = js.native
    inline def RelativeFolderPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RelativeFolderPath")(x.asInstanceOf[js.Any])
    
    /** Title of the list. */
    @JSImport("camljs", "CamlValues.ListProperty.Title")
    @js.native
    def Title: String = js.native
    inline def Title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    /** View selector with links to views for the list. */
    @JSImport("camljs", "CamlValues.ListProperty.ViewSelector")
    @js.native
    def ViewSelector: String = js.native
    inline def ViewSelector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ViewSelector")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("camljs", "CamlValues.Now")
  @js.native
  def Now: String = js.native
  inline def Now_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Now")(x.asInstanceOf[js.Any])
  
  /** Dynamic value that represents a property of the current SPWeb */
  /* static member */
  object ProjectProperty {
    
    @JSImport("camljs", "CamlValues.ProjectProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /** Category of the current post item. */
    @JSImport("camljs", "CamlValues.ProjectProperty.BlogCategoryTitle")
    @js.native
    def BlogCategoryTitle: String = js.native
    inline def BlogCategoryTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlogCategoryTitle")(x.asInstanceOf[js.Any])
    
    /** Title of the current post item. */
    @JSImport("camljs", "CamlValues.ProjectProperty.BlogPostTitle")
    @js.native
    def BlogPostTitle: String = js.native
    inline def BlogPostTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlogPostTitle")(x.asInstanceOf[js.Any])
    
    /** Represents a description for the current website. */
    @JSImport("camljs", "CamlValues.ProjectProperty.Description")
    @js.native
    def Description: String = js.native
    inline def Description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    /** Represents a value that determines whether the recycle bin is enabled for the current website. */
    @JSImport("camljs", "CamlValues.ProjectProperty.RecycleBinEnabled")
    @js.native
    def RecycleBinEnabled: String = js.native
    inline def RecycleBinEnabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RecycleBinEnabled")(x.asInstanceOf[js.Any])
    
    /** User name of the owner for the current site collection. */
    @JSImport("camljs", "CamlValues.ProjectProperty.SiteOwnerName")
    @js.native
    def SiteOwnerName: String = js.native
    inline def SiteOwnerName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SiteOwnerName")(x.asInstanceOf[js.Any])
    
    /** Full URL of the current site collection. */
    @JSImport("camljs", "CamlValues.ProjectProperty.SiteUrl")
    @js.native
    def SiteUrl: String = js.native
    inline def SiteUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SiteUrl")(x.asInstanceOf[js.Any])
    
    /** Title of the current Web site. */
    @JSImport("camljs", "CamlValues.ProjectProperty.Title")
    @js.native
    def Title: String = js.native
    inline def Title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    /** Full URL of the current Web site. */
    @JSImport("camljs", "CamlValues.ProjectProperty.Url")
    @js.native
    def Url: String = js.native
    inline def Url_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Url")(x.asInstanceOf[js.Any])
  }
  
  /** Dynamic value that represents current date */
  /* static member */
  @JSImport("camljs", "CamlValues.Today")
  @js.native
  def Today: String = js.native
  
  /** Dynamic value that represents current date with specified offset (may be negative) */
  /* static member */
  inline def TodayWithOffset(offsetDays: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("TodayWithOffset")(offsetDays.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def Today_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Today")(x.asInstanceOf[js.Any])
  
  /** Dynamic value that represents Id of the current user */
  /* static member */
  @JSImport("camljs", "CamlValues.UserID")
  @js.native
  def UserID: String = js.native
  inline def UserID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserID")(x.asInstanceOf[js.Any])
}
