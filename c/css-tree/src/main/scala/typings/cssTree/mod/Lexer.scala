package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-tree", "Lexer")
@js.native
open class Lexer () extends StObject {
  
  def `match`(syntax: String, value: String): LexerMatchResult = js.native
  def `match`(syntax: String, value: CssNode): LexerMatchResult = js.native
  def `match`(syntax: DSNode, value: String): LexerMatchResult = js.native
  def `match`(syntax: DSNode, value: CssNode): LexerMatchResult = js.native
  
  def matchAtruleDescriptor(atruleName: String, descriptorName: String, value: String): LexerMatchResult = js.native
  def matchAtruleDescriptor(atruleName: String, descriptorName: String, value: CssNode): LexerMatchResult = js.native
  
  def matchAtrulePrelude(atruleName: String, prelude: String): LexerMatchResult = js.native
  def matchAtrulePrelude(atruleName: String, prelude: CssNode): LexerMatchResult = js.native
  
  def matchDeclaration(node: CssNode): LexerMatchResult = js.native
  
  def matchProperty(propertyName: String, value: String): LexerMatchResult = js.native
  def matchProperty(propertyName: String, value: CssNode): LexerMatchResult = js.native
  
  def matchType(typeName: String, value: String): LexerMatchResult = js.native
  def matchType(typeName: String, value: CssNode): LexerMatchResult = js.native
}
