package typings.cypress.Cypress

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StorableArray = std.Array<cypress.Cypress.Storable>
}}}
to avoid circular code involving: 
- cypress.Cypress.Storable
- cypress.Cypress.StorableArray
*/
@js.native
trait StorableArray
  extends StObject
     with Array[Storable]
     with _Storable
