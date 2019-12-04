package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextPage extends js.Object {
  var nextPage: Double
  var prevPage: Double
}

object Anon_NextPage {
  @scala.inline
  def apply(nextPage: Double, prevPage: Double): Anon_NextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NextPage]
  }
}

