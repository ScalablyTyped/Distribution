package typings
package camljsLib.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IJoinable extends js.Object {
  /** Join the list you're querying with another list.
              Joins are only allowed through a lookup field relation.
              @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
              @alias alias for the joined list */
  def InnerJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin
  /** Join the list you're querying with another list.
              Joins are only allowed through a lookup field relation.
              @param lookupFieldInternalName Internal name of the lookup field, that points to the list you're going to join in.
              @alias alias for the joined list */
  def LeftJoin(lookupFieldInternalName: java.lang.String, alias: java.lang.String): IJoin
}

