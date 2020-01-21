package typings.camelcase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camelcase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function camelcase(
  // 	input: string | ReadonlyArray<string>,
  // 	options?: camelcase.Options
  // ): string;
  // export = camelcase;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof camelcase */ js.Any = js.native
  /**
  	Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`.
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
  	camelCase('Foo-Bar', {pascalCase: true});
  	//=> 'FooBar'
  	camelCase('--foo.bar', {pascalCase: false});
  	//=> 'fooBar'
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
  	```
  	*/
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
  def apply(input: js.Array[String]): String = js.native
  def apply(input: js.Array[String], options: Options): String = js.native
}

