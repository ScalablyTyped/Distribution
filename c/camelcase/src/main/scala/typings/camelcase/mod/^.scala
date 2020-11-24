package typings.camelcase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("camelcase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`.
  Correctly handles Unicode strings.
  @param input - String to convert to camel case.
  @example
  ```
  import camelCase = require('camelcase');
  camelCase('foo-bar');
  //=> 'fooBar'
  camelCase('foo_bar');
  //=> 'fooBar'
  camelCase('Foo-Bar');
  //=> 'fooBar'
  camelCase('розовый_пушистый_единороги');
  //=> 'розовыйПушистыйЕдинороги'
  camelCase('Foo-Bar', {pascalCase: true});
  //=> 'FooBar'
  camelCase('--foo.bar', {pascalCase: false});
  //=> 'fooBar'
  camelCase('Foo-BAR', {preserveConsecutiveUppercase: true});
  //=> 'fooBAR'
  camelCase('fooBAR', {pascalCase: true, preserveConsecutiveUppercase: true}));
  //=> 'FooBAR'
  camelCase('foo bar');
  //=> 'fooBar'
  console.log(process.argv[3]);
  //=> '--foo-bar'
  camelCase(process.argv[3]);
  //=> 'fooBar'
  camelCase(['foo', 'bar']);
  //=> 'fooBar'
  camelCase(['__foo__', '--bar'], {pascalCase: true});
  //=> 'FooBar'
  camelCase(['foo', 'BAR'], {pascalCase: true, preserveConsecutiveUppercase: true})
  //=> 'FooBAR'
  camelCase('lorem-ipsum', {locale: 'en-US'});
  //=> 'loremIpsum'
  ```
  */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
  def apply(input: js.Array[String]): String = js.native
  def apply(input: js.Array[String], options: Options): String = js.native
}
