package typings.creditkeyJs

import typings.creditkeyJs.mod.Copy
import typings.creditkeyJs.mod.Display
import typings.creditkeyJs.mod.Mode
import typings.creditkeyJs.mod.Platform
import typings.creditkeyJs.mod.Size
import typings.creditkeyJs.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creditkeyJsStrings {
  
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  
  @scala.inline
  def button_text: button_text = "button_text".asInstanceOf[button_text]
  
  @scala.inline
  def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @scala.inline
  def modal: modal = "modal".asInstanceOf[modal]
  
  @scala.inline
  def pdp: pdp = "pdp".asInstanceOf[pdp]
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @scala.inline
  def staging: staging = "staging".asInstanceOf[staging]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait approved extends Status
  
  @js.native
  sealed trait button extends Display
  
  @js.native
  sealed trait button_text extends Display
  
  @js.native
  sealed trait checkout extends Copy
  
  @js.native
  sealed trait declined extends Status
  
  @js.native
  sealed trait development extends Platform
  
  @js.native
  sealed trait large extends Size
  
  @js.native
  sealed trait medium extends Size
  
  @js.native
  sealed trait modal extends Mode
  
  @js.native
  sealed trait pdp extends Copy
  
  @js.native
  sealed trait pending extends Status
  
  @js.native
  sealed trait production extends Platform
  
  @js.native
  sealed trait redirect extends Mode
  
  @js.native
  sealed trait small extends Size
  
  @js.native
  sealed trait staging extends Platform
  
  @js.native
  sealed trait text extends Display
}
