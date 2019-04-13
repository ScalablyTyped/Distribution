package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJoinable extends js.Object {
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @param alias Alias for the joined list
    @param fromList (optional) List where the lookup column resides - use it only for nested joins */
  def InnerJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin = js.native
  def InnerJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String, fromList: java.lang.String): IJoin = js.native
  /** Join the list you're querying with another list.
    Joins are only allowed through a lookup field relation.
    @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
    @param alias Alias for the joined list
    @param fromList (optional) List where the lookup column resides - use it only for nested joins */
  def LeftJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin = js.native
  def LeftJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String, fromList: java.lang.String): IJoin = js.native
}

