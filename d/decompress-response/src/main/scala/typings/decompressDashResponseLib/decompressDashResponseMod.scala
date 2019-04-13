package typings
package decompressDashResponseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decompress-response", JSImport.Namespace)
@js.native
object decompressDashResponseMod extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function decompressResponse(response: IncomingMessage): IncomingMessage;
  // export = decompressResponse;
  @JSName("default")
  var default_Original: decompressDashResponseLib.Anon_Default = js.native
  /**
  	Decompress a HTTP response if needed.
  	@param response - The HTTP incoming stream with compressed data.
  	@returns The decompressed HTTP response stream.
  	@example
  	```
  	import {http} from 'http';
  	import decompressResponse = require('decompress-response');
  	http.get('https://sindresorhus.com', response => {
  		response = decompressResponse(response);
  	});
  	```
  	*/
  def apply(response: nodeLib.httpMod.IncomingMessage): nodeLib.httpMod.IncomingMessage = js.native
  /**
  	Decompress a HTTP response if needed.
  	@param response - The HTTP incoming stream with compressed data.
  	@returns The decompressed HTTP response stream.
  	@example
  	```
  	import {http} from 'http';
  	import decompressResponse = require('decompress-response');
  	http.get('https://sindresorhus.com', response => {
  		response = decompressResponse(response);
  	});
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function decompressResponse(response: IncomingMessage): IncomingMessage;
  // export = decompressResponse;
  def default(response: nodeLib.httpMod.IncomingMessage): nodeLib.httpMod.IncomingMessage = js.native
}

