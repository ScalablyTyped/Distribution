package typings.cucumberGherkin.distSrcParserMod

import typings.cucumberGherkin.distSrcItokenMod.IGherkinLine
import typings.cucumberGherkin.distSrcItokenMod.IToken
import typings.cucumberGherkin.distSrcItokenMod.Item
import typings.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType
import typings.cucumberMessages.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cucumber/gherkin/dist/src/Parser", "Token")
@js.native
open class Token protected ()
  extends StObject
     with IToken[TokenType] {
  def this(line: typings.cucumberGherkin.distSrcGherkinLineMod.default, location: Location) = this()
  
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /* CompleteClass */
  override def getTokenValue(): String = js.native
  
  /* CompleteClass */
  var isEof: Boolean = js.native
  
  /* CompleteClass */
  var line: IGherkinLine = js.native
  @JSName("line")
  val line_Token: typings.cucumberGherkin.distSrcGherkinLineMod.default = js.native
  
  /* CompleteClass */
  var location: Location = js.native
  
  /* CompleteClass */
  var matchedGherkinDialect: String = js.native
  
  /* CompleteClass */
  var matchedIndent: Double = js.native
  
  /* CompleteClass */
  var matchedItems: js.Array[Item] = js.native
  
  /* CompleteClass */
  var matchedKeyword: String = js.native
  
  /* CompleteClass */
  var matchedKeywordType: StepKeywordType = js.native
  
  /* CompleteClass */
  var matchedType: TokenType = js.native
}
