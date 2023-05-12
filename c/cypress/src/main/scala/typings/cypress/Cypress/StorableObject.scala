package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StorableObject = {[key: string] : cypress.Cypress.Storable}
}}}
to avoid circular code involving: 
- cypress.Cypress.Storable
- cypress.Cypress.StorableArray
- cypress.Cypress.StorableObject
- cypress.Cypress.StorableRecord
- cypress.Cypress.StorageByOrigin
*/
trait StorableObject
  extends StObject
     with /* key */ StringDictionary[Storable]
     with _Storable
object StorableObject {
  
  inline def apply(): StorableObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorableObject]
  }
}
