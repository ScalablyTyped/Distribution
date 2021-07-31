package typings.cssTree.mod

import typings.std.SyntaxError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionSyntax_ extends StObject {
  
  /**
    * Generates CSS value definition syntax from an AST
    *
    * @param node - The AST
    * @param options - Options that affect generation
    *
    * @example
    *  generate({type: 'Keyword', name: 'foo'}) => 'foo'
    */
  def generate(node: DSNode): String = js.native
  def generate(node: DSNode, options: DSGenerateOptions): String = js.native
  
  /**
    * Generates an AST from a CSS value syntax
    *
    * @param source - The CSS value syntax to parse
    *
    * @example
    *  parse('foo | bar') =>
    *    {
    *      type: 'Group',
    *      terms: [
    *        { type: 'Keyword', name: 'foo' },
    *        { type: 'Keyword', name: 'bar' }
    *      ],
    *      combinator: '|',
    *      disallowEmpty: false,
    *      explicit: false
    *    }
    */
  def parse(source: String): DSNodeGroup = js.native
  
  /**
    * Wrapper for syntax errors
    */
  var syntaxError: SyntaxError = js.native
  
  /**
    * Walks definition syntax AST
    */
  def walk(node: DSNode, options: DSWalkEnterOrLeaveFn): Unit = js.native
  def walk(node: DSNode, options: DSWalkEnterOrLeaveFn, context: js.Any): Unit = js.native
  def walk(node: DSNode, options: DSWalkOptions): Unit = js.native
  def walk(node: DSNode, options: DSWalkOptions, context: js.Any): Unit = js.native
}
