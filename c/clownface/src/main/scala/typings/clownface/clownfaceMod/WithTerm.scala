package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTerm extends js.Object {
  var term: Term | js.Array[Term]
}

object WithTerm {
  @scala.inline
  def apply(term: Term | js.Array[Term]): WithTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithTerm]
  }
}

