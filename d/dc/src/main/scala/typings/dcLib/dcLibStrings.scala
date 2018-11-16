package typings
package dcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dcLibStrings {
  @js.native
  sealed trait filtered extends js.Object
  
  @js.native
  sealed trait postRedraw extends js.Object
  
  @js.native
  sealed trait postRender extends js.Object
  
  @js.native
  sealed trait preRedraw extends js.Object
  
  @js.native
  sealed trait preRender extends js.Object
  
  @js.native
  sealed trait pretransition extends js.Object
  
  @js.native
  sealed trait renderlet extends js.Object
  
  @js.native
  sealed trait zoomed extends js.Object
  
  def filtered: filtered = "filtered".asInstanceOf[filtered]
  def postRedraw: postRedraw = "postRedraw".asInstanceOf[postRedraw]
  def postRender: postRender = "postRender".asInstanceOf[postRender]
  def preRedraw: preRedraw = "preRedraw".asInstanceOf[preRedraw]
  def preRender: preRender = "preRender".asInstanceOf[preRender]
  def pretransition: pretransition = "pretransition".asInstanceOf[pretransition]
  def renderlet: renderlet = "renderlet".asInstanceOf[renderlet]
  def zoomed: zoomed = "zoomed".asInstanceOf[zoomed]
}

