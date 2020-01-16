package typings.clownface.clownfaceMod

import typings.rdfDashJs.rdfDashJsMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTerms[T /* <: Term */] extends js.Object {
  var term: js.Array[T]
}

object WithTerms {
  @scala.inline
  def apply[T /* <: Term */](term: js.Array[T]): WithTerms[T] = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithTerms[T]]
  }
}

