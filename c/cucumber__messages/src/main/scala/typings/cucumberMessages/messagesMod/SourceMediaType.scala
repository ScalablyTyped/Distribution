package typings.cucumberMessages.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceMediaType extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "SourceMediaType")
@js.native
object SourceMediaType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SourceMediaType & String] = js.native
  
  @js.native
  sealed trait TEXT_X_CUCUMBER_GHERKIN_MARKDOWN
    extends StObject
       with SourceMediaType
  /* "text/x.cucumber.gherkin+markdown" */ val TEXT_X_CUCUMBER_GHERKIN_MARKDOWN: typings.cucumberMessages.messagesMod.SourceMediaType.TEXT_X_CUCUMBER_GHERKIN_MARKDOWN & String = js.native
  
  @js.native
  sealed trait TEXT_X_CUCUMBER_GHERKIN_PLAIN
    extends StObject
       with SourceMediaType
  /* "text/x.cucumber.gherkin+plain" */ val TEXT_X_CUCUMBER_GHERKIN_PLAIN: typings.cucumberMessages.messagesMod.SourceMediaType.TEXT_X_CUCUMBER_GHERKIN_PLAIN & String = js.native
}
