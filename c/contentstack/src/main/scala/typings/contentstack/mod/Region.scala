package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Region extends StObject
@JSImport("contentstack", "Region")
@js.native
object Region extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Region & String] = js.native
  
  @js.native
  sealed trait AZURE_EU
    extends StObject
       with Region
  /* "azure-eu" */ val AZURE_EU: typings.contentstack.mod.Region.AZURE_EU & String = js.native
  
  @js.native
  sealed trait AZURE_NA
    extends StObject
       with Region
  /* "azure-na" */ val AZURE_NA: typings.contentstack.mod.Region.AZURE_NA & String = js.native
  
  @js.native
  sealed trait EU
    extends StObject
       with Region
  /* "eu" */ val EU: typings.contentstack.mod.Region.EU & String = js.native
  
  @js.native
  sealed trait US
    extends StObject
       with Region
  /* "us" */ val US: typings.contentstack.mod.Region.US & String = js.native
}
