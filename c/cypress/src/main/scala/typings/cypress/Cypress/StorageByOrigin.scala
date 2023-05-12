package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StorageByOrigin = {[key: string] : cypress.Cypress.StorableRecord}
}}}
to avoid circular code involving: 
- cypress.Cypress.Storable
- cypress.Cypress.StorableArray
- cypress.Cypress.StorableRecord
- cypress.Cypress.StorageByOrigin
*/
trait StorageByOrigin
  extends StObject
     with /* key */ StringDictionary[StorableRecord]
object StorageByOrigin {
  
  inline def apply(): StorageByOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageByOrigin]
  }
}
