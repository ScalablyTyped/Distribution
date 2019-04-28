
# Scala.js typings for command-line-commands

Typings are for version 2.0.0

## Library description:
Add a git-like command interface to your app.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | command-line-commands |
| Keywords           | argv, parse, argument, args, option, parser, parsing, cli, command, commands, line |
| # releases         | 2 |
| # dependents       | 76 |
| # downloads        | 1652055 |
| # stars            | 4 |

## Links
- [Homepage](https://github.com/75lb/command-line-commands#readme)
- [Bugs](https://github.com/75lb/command-line-commands/issues)
- [Repository](https://github.com/75lb/command-line-commands)
- [Npm](https://www.npmjs.com/package/command-line-commands)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for command-line-commands 2.0.0
// Project: https://github.com/75lb/command-line-commands
// Definitions by: CzBuCHi <https://github.com/CzBuCHi>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * Parses the `argv` value supplied (or `process.argv` by default), extracting and returning the `command` and remainder of `argv`. The command will be the first value in the `argv` array unless it is an option (e.g. `--help`).
 *
 * @param {string|string[]} - One or more command strings, one of which the user must supply. Include `null` to represent "no command" (effectively making a command optional).
 * @param [argv] {string[]} - An argv array, defaults to the global `process.argv` if not supplied.
 * @returns {{ command: string, argv: string[] }}
 * @throws `INVALID_COMMAND` - user supplied a command not specified in `commands`.
 */

```

