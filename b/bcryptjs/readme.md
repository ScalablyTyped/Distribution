```
// Type definitions for bcryptjs v2.4.0
// Project: https://github.com/dcodeIO/bcrypt.js
// Definitions by: Joshua Filby <https://github.com/Joshua-F/>
//                 Rafael Kraut <https://github.com/RafaelKr>
//                 Branislav Holý <https://github.com/branoholy>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.1
/**
 * Sets the pseudo random number generator to use as a fallback if neither node's crypto module nor the Web Crypto API is available.
 * Please note: It is highly important that the PRNG used is cryptographically secure and that it is seeded properly!
 * @param  random Function taking the number of bytes to generate as its sole argument, returning the corresponding array of cryptographically secure random byte values.
 */
```