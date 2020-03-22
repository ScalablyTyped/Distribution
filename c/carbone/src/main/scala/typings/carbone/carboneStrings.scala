package typings.carbone

import typings.carbone.mod.DocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object carboneStrings {
  @js.native
  sealed trait document extends DocumentType
  
  @js.native
  sealed trait graphics extends DocumentType
  
  @js.native
  sealed trait presentation extends DocumentType
  
  @js.native
  sealed trait spreadsheet extends DocumentType
  
  @js.native
  sealed trait web extends DocumentType
  
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def graphics: graphics = "graphics".asInstanceOf[graphics]
  @scala.inline
  def presentation: presentation = "presentation".asInstanceOf[presentation]
  @scala.inline
  def spreadsheet: spreadsheet = "spreadsheet".asInstanceOf[spreadsheet]
  @scala.inline
  def web: web = "web".asInstanceOf[web]
}

