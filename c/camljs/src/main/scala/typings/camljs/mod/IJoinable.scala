package typings.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJoinable extends StObject {
  
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @param alias Alias for the joined list
    @param fromList (optional) List where the lookup column resides - use it only for nested joins */
  def InnerJoin(lookupFieldInternalName: String, alias: String): IJoin = js.native
  def InnerJoin(lookupFieldInternalName: String, alias: String, fromList: String): IJoin = js.native
  
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @param alias Alias for the joined list
    @param fromList (optional) List where the lookup column resides - use it only for nested joins */
  def LeftJoin(lookupFieldInternalName: String, alias: String): IJoin = js.native
  def LeftJoin(lookupFieldInternalName: String, alias: String, fromList: String): IJoin = js.native
}
