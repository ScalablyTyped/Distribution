```
// Type definitions for catbox 10.0
// Project: https://github.com/hapijs/catbox
// Definitions by: Jason Swearingen <https://github.com/jasonswearingen>
//                 AJP <https://github.com/AJamesPhillips>
//                 Rodrigo Saboya <https://github.com/saboya>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/**
 * Client
 * The Client object provides a low-level cache abstraction. The object is constructed using new Client(engine, options) where:
 * engine - is an object or a prototype function implementing the cache strategy:
 *  * function - a prototype function with the signature function(options). catbox will call new func(options).
 *  * object - a pre instantiated client implementation object. Does not support passing options.
 * options - the strategy configuration object. Each strategy defines its own configuration options with the following common options:
 *  * partition - the partition name used to isolate the cached results across multiple clients. The partition name is used as the MongoDB database name,
 *    the Riak bucket, or as a key prefix in Redis and Memcached. To share the cache across multiple clients, use the same partition name.
 * @see {@link https://github.com/hapijs/catbox#client}
 */
```